package coursier.sbtlauncher

import java.io.File
import java.util.concurrent.Callable

case object DummyGlobalLock extends xsbti.GlobalLock {
  def apply[T](lockFile: File, run: Callable[T]): T = {
    Console.err.println(s"** Asked a lock on $lockFile **")
    run.call()
  }
}
