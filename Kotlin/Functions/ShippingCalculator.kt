fun shippingCost(amount: Double, international: Boolean): Double {

    var shippingFee = 0.0

    when (international) {
        true -> {
            shippingFee = amount * 0.15
            if (shippingFee > 50)
                shippingFee = 50.0
        }
        false -> {
            if (amount < 75)
                shippingFee = amount * 0.10
        }
    }

    return shippingFee
}

fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()
    println(shippingCost(total, international))
}
