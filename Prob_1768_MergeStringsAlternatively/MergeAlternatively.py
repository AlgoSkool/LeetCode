def mergeAlternately(word1: str, word2: str) -> str:
    i = 0
    j = 0
    result = []
    # Merge characters alternately
    while i < len(word1) and j < len(word2):
        result.append(word1[i])
        result.append(word2[j])
        i += 1
        j += 1
    # Append remaining characters from word1, if any
    if i < len(word1):
        result.append(word1[i:])
    # Append remaining characters from word2, if any
    if j < len(word2):
        result.append(word2[j:])  # Corrected to use 'j' for slicing word2
    result = "".join(result)
    return result

# Example usage
print(mergeAlternately("abc", "pqr"))  # Output: "apbqcr"
print(mergeAlternately("ab", "pqrs"))  # Output: "apbqrs"
