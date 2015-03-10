(ns reagent-tut.core
    (:require [reagent.core :as reagent]))

(defn comment-list []
  [:div {:className "commentList"}
   "Hello, world! I am a CommentList"])

(defn comment-form []
  [:div {:className "commentForm"}
   "Hello, world! I am a CommentForm"])

(defn comment-box [] 
  [:div {:className "commentBox"} 
   [:h1 "Comments"]
   [comment-list]
   [comment-form]])

(reagent/render-component [comment-box]
                          (.getElementById js/document "app"))
