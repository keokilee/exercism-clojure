(ns rna-transcription)

(defn to-rna [rna] 
  (if (= rna "") rna
    (cond
      (= (first rna) \C) (str "G" (to-rna (subs rna 1)))
      (= (first rna) \G) (str "C" (to-rna (subs rna 1)))
      (= (first rna) \A) (str "U" (to-rna (subs rna 1)))
      :else (str "A" (to-rna (subs rna 1))))))
