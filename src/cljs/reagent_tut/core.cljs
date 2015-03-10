(ns reagent-tut.core
    (:require [reagent.core :as reagent]))

(defn comment [author text]
  [:div {:className "comment"}
   [:h2 {:className="commentAuthor"} author]
   text])

(defn comment-list []
  [:div {:className "commentList"}
   [comment "Pete Hunt" "This is one comment"]
   [comment "Jordan Walke" "This is *another* comment"]])

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
