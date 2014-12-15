(ns rna-transcription)

(defn to-rna [rna] 
  (if (= rna "") rna
    (let [nc (first rna)
          _ (assert ((set "CGAT") nc))
         substrand (subs rna 1)]
    (cond
      (= nc \C) (str "G" (to-rna substrand))
      (= nc \G) (str "C" (to-rna substrand))
      (= nc \A) (str "U" (to-rna substrand))
      :else (str "A" (to-rna substrand))))))
