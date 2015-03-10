(ns reagent-tut.core
    (:require [reagent.core :as reagent]))

(defn comment-box [] 
  [:div 
   {:className "commentBox"} 
   "Hello, world! I am a CommentBox."])

(reagent/render-component [comment-box]
                          (.getElementById js/document "app"))
