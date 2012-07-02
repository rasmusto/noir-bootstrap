(ns noir-bootstrap.views.welcome
  (:require [noir-bootstrap.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

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
             [:li {"class" "active" "data-toggle" "tab"}
              [:a {"href" "#home"} "Home"]]
             [:li {"data-toggle" "tab"}
              [:a {"href" "#profile"} "Profile"]]
             [:li {"data-toggle" "tab"}
              [:a {"href" "#messages"} "Messages"]]]
            [:div.tab-content
             [:div {"class" "tab-pane active" "id" "home"}
              [:p "home content"]]
             [:div {"class" "tab-pane" "id" "profile"}
              [:p "profile content"]]
             [:div {"class" "tab-pane" "id" "messages"}
              [:p "messages content"]]]]))



 ;<h3>Tabbable example</h3>
      ;<p>To make tabs tabbable, create a <code>.tab-pane</code> with unique ID for every tab and wrap them in <code>.tab-content</code>.</p>
      ;<div class="tabbable" style="margin-bottom: 18px;">
        ;<ul class="nav nav-tabs">
          ;<li class="active"><a href="#tab1" data-toggle="tab">Section 1</a></li>
          ;<li><a href="#tab2" data-toggle="tab">Section 2</a></li>
          ;<li><a href="#tab3" data-toggle="tab">Section 3</a></li>
        ;</ul>
        ;<div class="tab-content" style="padding-bottom: 9px; border-bottom: 1px solid #ddd;">
          ;<div class="tab-pane active" id="tab1">
            ;<p>I'm in Section 1.</p>
          ;</div>
          ;<div class="tab-pane" id="tab2">
            ;<p>Howdy, I'm in Section 2.</p>
          ;</div>
          ;<div class="tab-pane" id="tab3">
            ;<p>What up girl, this is Section 3.</p>
          ;</div>
