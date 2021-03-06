//: ----------------------------------------------------------------------------
//: Copyright (C) 2017 Verizon.  All Rights Reserved.
//:
//:   Licensed under the Apache License, Version 2.0 (the "License");
//:   you may not use this file except in compliance with the License.
//:   You may obtain a copy of the License at
//:
//:       http://www.apache.org/licenses/LICENSE-2.0
//:
//:   Unless required by applicable law or agreed to in writing, software
//:   distributed under the License is distributed on an "AS IS" BASIS,
//:   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//:   See the License for the specific language governing permissions and
//:   limitations under the License.
//:
//: ----------------------------------------------------------------------------
resolvers += Resolver.url(
  "tpolecat-sbt-plugin-releases",
    url("http://dl.bintray.com/content/tpolecat/sbt-plugin-releases"))(
        Resolver.ivyStylePatterns)

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"    % "0.1.3")
addSbtPlugin("io.verizon.build"          % "sbt-rig"         % "2.0.29")

// docs
addSbtPlugin("com.typesafe.sbt"          % "sbt-site"        % "0.8.1")
addSbtPlugin("com.typesafe.sbt"          % "sbt-ghpages"     % "0.5.3")
addSbtPlugin("com.typesafe"              % "sbt-mima-plugin" % "0.1.14")
addSbtPlugin("org.tpolecat"              % "tut-plugin"      % "0.4.7")
addSbtPlugin("com.eed3si9n"              % "sbt-unidoc"      % "0.3.2")

scalacOptions += "-deprecation"

