package ${PACKAGE_NAME}

import com.spot.spot.helper.AnalyticsEventGroup

sealed class ${NAME}Analytics : AnalyticsEventGroup {

    override val groupKey = "XXXX_"

    override val key: String
        get() {
            return when (this) {
                is OnAppeared -> "appeared"
                is OnNextClick -> "next_click"
                is OnSelectedCoin -> "selected_coin"
            }
        }

    override val properties: Map<String, Any>?
        get() {
            return when (this) {
                is OnSelectedCoin -> mapOf("cryptocurrency_id" to walletCoin.cryptocurrency.id)
                else -> null
            }
        }

    object OnAppeared : ${NAME}Analytics()
    object OnNextClick : ${NAME}Analytics()
    data class OnSelectedCoin(val walletCoin: WalletCoin): ${NAME}Analytics()
}