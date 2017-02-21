package coursier.sbtlauncher

import java.io.File
import java.util.concurrent.Callable

case object DummyGlobalLock extends xsbti.GlobalLock {
  def apply[T](lockFile: File, run: Callable[T]): T =
    run.call()
}
