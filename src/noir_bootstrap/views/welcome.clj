(ns noir-bootstrap.views.welcome
  (:require [noir-bootstrap.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defn tab [n]
  (html [:a {"href" (str "#" n) "data-toggle" "tab"} n]))

(defn tabcontent [n c & active?]
  (html (if active? [:div {"class" (str "tab-pane active") "id" (str n)} [:p (str c)]]
                    [:div {"class" "tab-pane" "id" (str n)} [:p (str c)]])))

(defpage "/" []
  (common/layout
   [:h1 "A page about myself"]
   [:p (list
         "This page was built using "
        [:a {"href" "http://webnoir.org"} "Noir"]
         " and "
        [:a {"href" "http://twitter.github.com/bootstrap/"} "Twitter Bootstrap"]
         "."
        [:br])]))

(defpage "/about" []
         (common/layout
           [:h1 "about me"]
           [:p "test"]))

(defpage "/buttons" []
         (common/layout
           [:div.btn-group
            [:button.btn "1"]
            [:button.btn "2"]
            [:button.btn "3"]
            [:button.btn "4"]
            [:button.btn "5"]]))

(defpage "/tabs" []
         (common/layout
           [:div.tabbable
            [:ul {"class" "nav nav-tabs"}
             [:li.active (tab "tab1")]
             [:li (tab "tab2")]
             [:li (tab "tab3")]]
            [:div.tab-content
             (tabcontent "tab1" "tab1 content" true)
             (tabcontent "tab2" "tab2 content")
             (tabcontent "tab3" "tab3 content")]]

           [:div.tabbable
            [:ul {"class" "nav nav-pills"}
             [:li.active (tab "test1")]
             [:li (tab "test2")]
             [:li (tab "test3")]]
            [:div.tab-content
             (tabcontent "test1" "test1 content" true)
             (tabcontent "test2" "test2 content")
             (tabcontent "test3" "test3 content")]]))
