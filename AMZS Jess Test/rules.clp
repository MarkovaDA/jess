(import example.amzs.model.*)
(deftemplate Issue       (declare (from-class Issue)))
(deftemplate IssueKeyword   (declare (from-class IssueKeyword)))
(deftemplate CatalogTopics (declare (from-class CatalogTopics)))

(defrule send-towing-vehicle
    "If somebody had an accident send a towing vehicle."
    (CatalogTopics (partNumber ?partNumber) (description /nesreca/))
    ;(CatalogTopics (partNumber 1))
    (IssueKeyword (partNumber ?partNumber))
    =>	
    (add (new Response "Send towing vehicle")))