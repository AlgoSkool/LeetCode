#include <iostream>
#include <string>
using namespace std;

string mergeAlternately(string word1, string word2) {
    string result;
    int minLength = min(word1.length(), word2.length());
    
    // Merge the characters in alternating order
    for (int i = 0; i < minLength; ++i) {
        result += word1[i];
        result += word2[i];
    }
    
    // Append any remaining characters from the longer word
    if (minLength < word1.length()) {
        result += word1.substr(minLength);
    }
    if (minLength < word2.length()) {
        result += word2.substr(minLength);
    }
    
    return result;
}

int main() {
    string word1 = "abc";
    string word2 = "pqr";
    cout << mergeAlternately(word1, word2) << endl;  // Output: "apbqcr"
    
    word1 = "ab";
    word2 = "pqrs";
    cout << mergeAlternately(word1, word2) << endl;  // Output: "apbqrs"
    
    return 0;
}
