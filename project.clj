(defproject appengine-magic "0.5.1-SNAPSHOT"
  :description "Google App Engine library for Clojure."
  :url "https://github.com/gcv/appengine-magic"
  :min-lein-version "2.0.0"
  :repositories {"releases" "http://appengine-magic-mvn.googlecode.com/svn/releases/"
                 "snapshots" "http://appengine-magic-mvn.googlecode.com/svn/snapshots/"}
  :deploy-repositories {"private" {:url "s3p://com.blue.mvn/releases"
                                   :username :env/AWS_ACCESS_KEY
                                   :passphrase :env/AWS_SECRET_KEY}}
  :plugins [[s3-wagon-private "1.1.2"]]
  :exclusions [org.clojure/clojure]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring/ring-core "1.1.0"]
                 [org.apache.commons/commons-exec "1.1"]
                 ;; App Engine supporting essentials
                 [javax.servlet/servlet-api "2.5"]
                 [commons-io "2.4"]
                 [commons-codec "1.7"]
                 [commons-fileupload "1.2.2"]
                 ;; App Engine administrative interface support
                 [tomcat/jasper-runtime "5.0.28"]
                 [org.apache.geronimo.specs/geronimo-jsp_2.1_spec "1.0.1"]
                 [javax.servlet/jstl "1.1.2"] ; repackaged-appengine-jakarta-jstl-1.1.2.jar
                 [taglibs/standard "1.1.2"] ; repackaged-appengine-jakarta-standard-1.1.2.jar
                 [commons-el "1.0"]
                 [leiningen "2.0.0"]
                 [lancet "1.0.2"]
                 ;; main App Engine libraries
                 [com.google.appengine/appengine-api-1.0-sdk "1.8.0"]
                 [com.google.appengine/appengine-api-labs "1.8.0"]
                 [com.google.appengine/appengine-api-stubs "1.8.0"]
                 [com.google.appengine/appengine-local-runtime "1.8.0"]
                 [com.google.appengine/appengine-local-runtime-shared "1.8.0"]
                 [com.google.appengine/appengine-testing "1.8.0"]
                 [com.google.appengine/appengine-tools-api "1.8.0"]])
