class Solution:
    def maxProduct(self, words: List[str]) -> int:
        max_product = 0
        for i in range(len(words)):
            for j in range(i + 1, len(words)):
                # Check if the two words share common letters
                if not (set(words[i]) & set(words[j])):
                    q = len(words[i]) * len(words[j])
                    if q > max_product:
                        max_product = q
        return max_product
