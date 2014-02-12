/*
 * Copyright (c) 2014, Inversoft Inc., All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.savantbuild.plugin.java

import java.nio.file.Path
import java.nio.file.Paths

/**
 * Layout class that defines the directories used by the Java plugin.
 */
class JavaLayout {
  /**
   * The build directory. Defaults to {@code build}.
   */
  Path buildDirectory = Paths.get("build")

  /**
   * The jar build directory. Defaults to {@code build/jars}.
   */
  Path jarOutputDirectory = buildDirectory.resolve("jars")

  /**
   * The main source directory. Defaults to {@code src/main/java}.
   */
  Path mainSourceDirectory = Paths.get("src/main/java")

  /**
   * The main resource directory. Defaults to {@code src/main/resources}.
   */
  Path mainResourceDirectory = Paths.get("src/main/resources")

  /**
   * The main build directory. Defaults to {@code build/classes/main}.
   */
  Path mainBuildDirectory = buildDirectory.resolve("classes/main")

  /**
   * The test source directory. Defaults to {@code src/test/java}.
   */
  Path testSourceDirectory = Paths.get("src/test/java")

  /**
   * The test resource directory. Defaults to {@code src/test/resources}.
   */
  Path testResourceDirectory = Paths.get("src/test/resources")

  /**
   * The test build directory. Defaults to {@code build/classes/test}.
   */
  Path testBuildDirectory = buildDirectory.resolve("classes/test")
}
