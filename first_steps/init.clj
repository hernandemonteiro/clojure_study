(println "Começando usar clojure!")


;; ###############################


;; isso é um comentário de linha

(comment
Isso é um comentário multilinhas
)


;; ###############################


;; declaração de variavel não constantes
(def total-na-variavel 15)

(println "Variável:"total-na-variavel)


;; ###############################


;; incrementando variavel
(def total-na-variavel (+ total-na-variavel 3))

(println total-na-variavel)


;; ###############################


(if (true? true) (println "condicional deu certo!"))