(ns forensics.views
  (:require [re-frame.core :as re-frame]
            [forensics.subs :as subs]
            ;;["@atlaskit/editor-core" :as ec]
            [reagent.core :as reagent]
            [cljss.core :refer [defstyles defkeyframes font-face inject-global]]
            [cljss.reagent :as rss :include-macros true :refer-macros [defstyled]]))

(inject-global
  {:body {:margin 0
          :background-color "#BCD"
          :color "#242424"}})

(defstyled App :div
  {:margin "2em"})

(.log js/console "hi")
;;(.log js/console ec/Editor)
;;(def Editor (reagent/adapt-react-class ec/Editor))

(def doc
  {:type "doc"
   :content
   [{:type "paragraph"
     :content
     [{:type "text" :text "hello"}]}]})


; (defn editor [doc]
;   [:div "editor here"
;    [Editor

;     {
;      ;;     :appearance "full-page"
;      :appearance "chromeless"
;      ;; :placeholder "Write something..."
;      ;; :should-focus true

;      ;; :allow-text-formatting true
;      ;; :allow-hyperlinks true
;      ;; :allow-code-blocks true
;      ;; :allow-lists true
;      ;; :allow-text-color true
;      ;; :allow-tables true
;      ;; :allow-unsupported-content true

;      :devTools true
;      :disabled true
;      :defaultValue (clj->js doc)}]])
     
(defn main-panel []
  [App
    (let [name (re-frame/subscribe [::subs/name])]
      [:div   
        "Hello from " 
        @name
        [:hr]
        ;;[editor doc]
        ])])

       
       
