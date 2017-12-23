```
Figwheel: Cutting some fruit, just a sec ...
Figwheel: Validating the configuration found in project.clj
Figwheel: Configuration Valid ;)
Figwheel: Starting server at http://0.0.0.0:3449
Figwheel: Watching build - dev
Compiling "resources/public/js/compiled/app.js" from ["src/cljs"]...
Failed to compile "resources/public/js/compiled/app.js" in 41.545 seconds.
----  Exception    ----

  Assert failed: cljs.analyzer/foreign-dep? expected symbol got "@atlaskit/editor-core"
(symbol? dep)

----  Exception Stack Trace  ----

java.lang.AssertionError: Assert failed: cljs.analyzer/foreign-dep? expected symbol got "@atlaskit/editor-core"
(symbol? dep)
 at cljs.analyzer$foreign_dep_QMARK_.invokeStatic (analyzer.cljc:2095)
    cljs.analyzer$foreign_dep_QMARK_.invoke (analyzer.cljc:2092)
    cljs.compiler$load_libs.invokeStatic (compiler.cljc:1123)
    cljs.compiler$load_libs.invoke (compiler.cljc:1105)
    cljs.compiler$eval13619$fn__13621.invoke (compiler.cljc:1182)
    clojure.lang.MultiFn.invoke (MultiFn.java:229)
    cljs.compiler$emit.invokeStatic (compiler.cljc:198)
    cljs.compiler$emit.invoke (compiler.cljc:178)
    cljs.compiler$emit_source.invokeStatic (compiler.cljc:1385)
    cljs.compiler$emit_source.invoke (compiler.cljc:1356)
    cljs.compiler$compile_file_STAR_$fn__13733.invoke (compiler.cljc:1456)
    cljs.compiler$with_core_cljs.invokeStatic (compiler.cljc:1271)
    cljs.compiler$with_core_cljs.invoke (compiler.cljc:1260)
    cljs.compiler$compile_file_STAR_.invokeStatic (compiler.cljc:1441)
    cljs.compiler$compile_file_STAR_.invoke (compiler.cljc:1434)
    cljs.compiler$compile_file$fn__13764.invoke (compiler.cljc:1538)
    cljs.compiler$compile_file.invokeStatic (compiler.cljc:1513)
    cljs.compiler$compile_file.invoke (compiler.cljc:1489)
    cljs.closure$compile_file.invokeStatic (closure.clj:540)
    cljs.closure$compile_file.invoke (closure.clj:531)
    cljs.closure$eval16078$fn__16079.invoke (closure.clj:609)
    cljs.closure$eval16014$fn__16015$G__16003__16022.invoke (closure.clj:493)
    cljs.closure$compile_sources$iter__16202__16206$fn__16207.invoke (closure.clj:954)
    clojure.lang.LazySeq.sval (LazySeq.java:40)
    clojure.lang.LazySeq.seq (LazySeq.java:49)
    clojure.lang.Cons.next (Cons.java:39)
    clojure.lang.RT.next (RT.java:706)
    clojure.core$next__5108.invokeStatic (core.clj:64)
    clojure.core$dorun.invokeStatic (core.clj:3134)
    clojure.core$doall.invokeStatic (core.clj:3140)
    clojure.core$doall.invoke (core.clj:3140)
    cljs.closure$compile_sources.invokeStatic (closure.clj:950)
    cljs.closure$compile_sources.invoke (closure.clj:939)
    cljs.closure$build.invokeStatic (closure.clj:2596)
    cljs.closure$build.invoke (closure.clj:2507)
    cljs.build.api$build.invokeStatic (api.clj:205)
    cljs.build.api$build.invoke (api.clj:189)
    figwheel_sidecar.components.cljs_autobuild$cljs_build.invokeStatic (cljs_autobuild.clj:28)
    figwheel_sidecar.components.cljs_autobuild$cljs_build.invoke (cljs_autobuild.clj:27)
    figwheel_sidecar.build_middleware.injection$hook$fn__29510.invoke (injection.clj:197)
    figwheel_sidecar.components.cljs_autobuild$notify_command_hook$fn__29898.invoke (cljs_autobuild.clj:68)
    figwheel_sidecar.components.cljs_autobuild$figwheel_start_and_end_messages$fn__29890.invoke (cljs_autobuild.clj:48)
    figwheel_sidecar.components.cljs_autobuild$catch_print_hook$fn__29930.invoke (cljs_autobuild.clj:185)
    figwheel_sidecar.components.cljs_autobuild$open_urls_hook$fn__29922.invoke (cljs_autobuild.clj:141)
    figwheel_sidecar.build_middleware.stamp_and_clean$hook$fn__29875.invoke (stamp_and_clean.clj:66)
    figwheel_sidecar.components.cljs_autobuild$color_output$fn__29902.invoke (cljs_autobuild.clj:79)
    figwheel_sidecar.components.cljs_autobuild.CLJSAutobuild.start (cljs_autobuild.clj:255)
    com.stuartsierra.component$eval27995$fn__27996$G__27985__27998.invoke (component.cljc:5)
    com.stuartsierra.component$eval27995$fn__27996$G__27984__28001.invoke (component.cljc:5)
    clojure.lang.AFn.applyToHelper (AFn.java:154)
    clojure.lang.AFn.applyTo (AFn.java:144)
    clojure.lang.Var.applyTo (Var.java:702)
    clojure.core$apply.invokeStatic (core.clj:659)
    clojure.core$apply.invoke (core.clj:652)
    com.stuartsierra.component$try_action.invokeStatic (component.cljc:117)
    com.stuartsierra.component$try_action.invoke (component.cljc:116)
    com.stuartsierra.component$update_system$fn__28054.invoke (component.cljc:139)
    clojure.lang.ArraySeq.reduce (ArraySeq.java:114)
    clojure.core$reduce.invokeStatic (core.clj:6747)
    clojure.core$reduce.invoke (core.clj:6730)
    com.stuartsierra.component$update_system.invokeStatic (component.cljc:135)
    com.stuartsierra.component$update_system.doInvoke (component.cljc:129)
    clojure.lang.RestFn.invoke (RestFn.java:445)
    com.stuartsierra.component$start_system.invokeStatic (component.cljc:163)
    com.stuartsierra.component$start_system.invoke (component.cljc:155)
    com.stuartsierra.component$start_system.invokeStatic (component.cljc:161)
    com.stuartsierra.component$start_system.invoke (component.cljc:155)
    com.stuartsierra.component.SystemMap.start (component.cljc:178)
    com.stuartsierra.component$eval27995$fn__27996$G__27985__27998.invoke (component.cljc:5)
    com.stuartsierra.component$eval27995$fn__27996$G__27984__28001.invoke (component.cljc:5)
    clojure.lang.Atom.swap (Atom.java:37)
    clojure.core$swap_BANG_.invokeStatic (core.clj:2344)
    clojure.core$swap_BANG_.invoke (core.clj:2337)
    figwheel_sidecar.system.FigwheelSystem.start (system.clj:119)
    com.stuartsierra.component$eval27995$fn__27996$G__27985__27998.invoke (component.cljc:5)
    com.stuartsierra.component$eval27995$fn__27996$G__27984__28001.invoke (component.cljc:5)
    clojure.lang.AFn.applyToHelper (AFn.java:154)
    clojure.lang.AFn.applyTo (AFn.java:144)
    clojure.lang.Var.applyTo (Var.java:702)
    clojure.core$apply.invokeStatic (core.clj:659)
    clojure.core$apply.invoke (core.clj:652)
    com.stuartsierra.component$try_action.invokeStatic (component.cljc:117)
    com.stuartsierra.component$try_action.invoke (component.cljc:116)
    com.stuartsierra.component$update_system$fn__28054.invoke (component.cljc:139)
    clojure.lang.ArraySeq.reduce (ArraySeq.java:109)
    clojure.core$reduce.invokeStatic (core.clj:6747)
    clojure.core$reduce.invoke (core.clj:6730)
    com.stuartsierra.component$update_system.invokeStatic (component.cljc:135)
    com.stuartsierra.component$update_system.doInvoke (component.cljc:129)
    clojure.lang.RestFn.invoke (RestFn.java:445)
    com.stuartsierra.component$start_system.invokeStatic (component.cljc:163)
    com.stuartsierra.component$start_system.invoke (component.cljc:155)
    com.stuartsierra.component$start_system.invokeStatic (component.cljc:161)
    com.stuartsierra.component$start_system.invoke (component.cljc:155)
    com.stuartsierra.component.SystemMap.start (component.cljc:178)
    figwheel_sidecar.system$start_figwheel_system$fn__30227.invoke (system.clj:668)
    figwheel_sidecar.system$dispatch_system_component_errors.invokeStatic (system.clj:654)
    figwheel_sidecar.system$dispatch_system_component_errors.invoke (system.clj:652)
    figwheel_sidecar.system$start_figwheel_system.invokeStatic (system.clj:668)
    figwheel_sidecar.system$start_figwheel_system.invoke (system.clj:666)
    figwheel_sidecar.system$start_figwheel_BANG__STAR_.invokeStatic (system.clj:703)
    figwheel_sidecar.system$start_figwheel_BANG__STAR_.invoke (system.clj:689)
    clojure.lang.AFn.applyToHelper (AFn.java:156)
    clojure.lang.AFn.applyTo (AFn.java:144)
    clojure.core$apply.invokeStatic (core.clj:657)
    clojure.core$apply.invoke (core.clj:652)
    figwheel_sidecar.system$start_figwheel_BANG_.invokeStatic (system.clj:747)
    figwheel_sidecar.system$start_figwheel_BANG_.doInvoke (system.clj:705)
    clojure.lang.RestFn.invoke (RestFn.java:408)
    figwheel_sidecar.repl_api$start_figwheel_from_lein.invokeStatic (repl_api.clj:151)
    figwheel_sidecar.repl_api$start_figwheel_from_lein.invoke (repl_api.clj:147)
    figwheel_sidecar.repl_api$launch_from_lein.invokeStatic (repl_api.clj:223)
    figwheel_sidecar.repl_api$launch_from_lein.invoke (repl_api.clj:215)
    user$eval30303.invokeStatic (form-init1773544683928002434.clj:1)
    user$eval30303.invoke (form-init1773544683928002434.clj:1)
    clojure.lang.Compiler.eval (Compiler.java:7062)
    clojure.lang.Compiler.eval (Compiler.java:7052)
    clojure.lang.Compiler.load (Compiler.java:7514)
    clojure.lang.Compiler.loadFile (Compiler.java:7452)
    clojure.main$load_script.invokeStatic (main.clj:278)
    clojure.main$init_opt.invokeStatic (main.clj:280)
    clojure.main$init_opt.invoke (main.clj:280)
    clojure.main$initialize.invokeStatic (main.clj:311)
    clojure.main$null_opt.invokeStatic (main.clj:345)
    clojure.main$null_opt.invoke (main.clj:342)
    clojure.main$main.invokeStatic (main.clj:424)
    clojure.main$main.doInvoke (main.clj:387)
    clojure.lang.RestFn.applyTo (RestFn.java:137)
    clojure.lang.Var.applyTo (Var.java:702)
    clojure.main.main (main.java:37)

Figwheel: Starting CSS Watcher for paths  ["resources/public/css"]
Launching ClojureScript REPL for build: dev
Figwheel Controls:
          (stop-autobuild)                ;; stops Figwheel autobuilder
          (start-autobuild [id ...])      ;; starts autobuilder focused on optional ids
          (switch-to-build id ...)        ;; switches autobuilder to different build
          (reset-autobuild)               ;; stops, cleans, and starts autobuilder
          (reload-config)                 ;; reloads build config and resets autobuild
          (build-once [id ...])           ;; builds source one time
          (clean-builds [id ..])          ;; deletes compiled cljs target files
          (print-config [id ...])         ;; prints out build configurations
          (fig-status)                    ;; displays current state of system
          (figwheel.client/set-autoload false)    ;; will turn autoloading off
          (figwheel.client/set-repl-pprint false) ;; will turn pretty printing off
  Switch REPL build focus:
          :cljs/quit                      ;; allows you to switch REPL to another build
    Docs: (doc function-name-here)
    Exit: Control+C or :cljs/quit
 Results: Stored in vars *1, *2, *3, *e holds last exception object
Prompt will show when Figwheel connects to your application
To quit, type: :cljs/quit
dev:cljs.user!{:conn 2}=>
```
