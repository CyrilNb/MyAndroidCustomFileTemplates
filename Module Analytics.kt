package ${PACKAGE_NAME}


import com.spot.spot.helper.AnalyticsEventGroup

sealed class ${MODULE_NAME}Analytics : AnalyticsEventGroup {

    override val groupKey = "XXXX_"

    override val key: String
        get() {
            return when (this) {
                is OnAppeared -> "appeared"
                is OnNextClick -> "next_click"
                is onSelectedCoin -> "selected_coin"
            }
        }

    override val properties: Map<String, Any>?
        get() {
            return when (this) {
                is OnSelectedCoin -> mapOf("cryptocurrency_id" to walletCoin.cryptocurrency.id)
                else -> null
            }
        }

    object OnAppeared : SwapAmountAnalytics()
    object OnNextClick : SwapAmountAnalytics()
    data class OnSelectedCoin(val walletCoin: WalletCoin): SwapAmountAnalytics()
}