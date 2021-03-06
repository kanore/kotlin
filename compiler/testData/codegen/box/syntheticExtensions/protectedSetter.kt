// DONT_TARGET_EXACT_BACKEND: JS JS_IR JS_IR_ES6 WASM NATIVE
// MODULE: lib
// FILE: JavaClass.java

public class JavaClass {
    private String x = null;

    public String getX() { return "OK"; }
    protected void setX(String x) { this.x = x; }
}

// MODULE: main(lib)
// FILE: 1.kt

package p

import JavaClass

fun box(): String {
    return KotlinClass().ok()
}

class KotlinClass : JavaClass() {
    fun ok(): String {
        x = "o"
        x += "k"
        return x
    }
}
