// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(inpString: String, txtRedact: String, redactChar: Char = 'X'): String {
    var redaction = ""
    val n = txtRedact.length

    for (i in 1..n) {
        redaction += redactChar
    }
    
    return inpString.replace(txtRedact, redaction)
}