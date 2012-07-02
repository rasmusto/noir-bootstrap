(ns noir-bootstrap.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "my-site"]
               (include-css "/docs/assets/css/bootstrap.css")
               (include-css "/docs/assets/css/bootstrap-responsive.css")
               [:style "body { padding-top: 60px; }"]]
              [:body
               (list
                [:div.navbar.navbar-fixed-top {"data-toggle" "collapse" "data-target" ".nav-collapse"}
                 [:div.navbar-inner
                  [:div.container
                   [:a.btn.btn-navbar
                    [:span.icon-bar]]
                  [:a.brand "Torben Rasmussen"]
                   [:div.nav-collapse
                    [:ul.nav
                     [:li.active
                      [:a {"href" "/"} "Home"]]
                     [:li
                      [:a {"href" "/about"} "about"]]
                     [:li
                      [:a {"href" "/buttons"} "buttons"]]
                     [:li
                      [:a {"href" "/tabs"} "tabs"]]
                     [:li
                      [:a {"href" "http://github.com/rasmusto"} "github"]]]]]]]
                [:div.container content]
                 (include-js "http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")
                 (include-js "/docs/assets/js/bootstrap.js")
                 (include-js "/docs/assets/js/bootstrap-tab.js"))]))
