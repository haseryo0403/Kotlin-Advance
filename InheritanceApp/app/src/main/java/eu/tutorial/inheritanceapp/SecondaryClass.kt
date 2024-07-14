package eu.tutorial.inheritanceapp

import org.w3c.dom.Text

open class SecondaryClass: BaseClass() {
    override fun role() {
        println("Knight of House of BaseClass")
    }
}