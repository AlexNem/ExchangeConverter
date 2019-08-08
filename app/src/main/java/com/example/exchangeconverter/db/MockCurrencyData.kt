package com.example.exchangeconverter.db

class MockCurrencyData() {

    fun Data():MutableList<CurrencyEntity>{
        var USD = CurrencyEntity(
            1, "Доллар США", "USD", 25.500, 28.800, 25.730 )
        var EUR = CurrencyEntity(
            2, "Євро", "EUR", 28.440, 28.900, 28.600 )
        var RUR = CurrencyEntity(
            3, "Російський Рубль", "RUR", 0.370, 0.410, 0.3900 )
        var GBP = CurrencyEntity(
            3, "Фунт Стерлінгів", "GBP", 0.370, 0.410, 0.390)
        var CHF = CurrencyEntity(
            3, "Швейцарський Франк", "CHF", 25.295, 26.540, 25.930 )
        var SEK = CurrencyEntity(
            3, "Шведська Крона", "SEK", 0.370, 0.410, 2.674)
        var PLN = CurrencyEntity(
            3, "Польський Злотий", "PLN", 0.370, 0.410, 6.670)
        var NOK = CurrencyEntity(
            3, "Норвезька Крона", "NOK", 0.370, 0.410, 0.390)
        var JPY = CurrencyEntity(
            3, "Японська Ієна", "JPY", 0.370, 0.410, 0.240)
        var DKK = CurrencyEntity(
            3, "Датська крона", "DKK", 0.370, 0.410, 3.850)
        var CAD = CurrencyEntity(
            3, "Канадський Доллар", "CAD", 0.370, 0.410, 19.470)
        var BYN = CurrencyEntity(
            3, "Білоруський Рубль", "BYN", 0.370, 0.410, 12.515)
        var CZK = CurrencyEntity(
            3, "Чеська Крона", "CZK", 0.370, 0.410, 1.110)
        var ILS = CurrencyEntity(
            3, "Ізраільський Шекель", "ILS", 0.370, 0.410, 7.370)

        val currencyMockList: List<CurrencyEntity>
        currencyMockList = ArrayList<CurrencyEntity>()
        currencyMockList.add(USD)
        currencyMockList.add(EUR)
        currencyMockList.add(RUR)
        currencyMockList.add(GBP)
        currencyMockList.add(CHF)
        currencyMockList.add(SEK)
        currencyMockList.add(PLN)
        currencyMockList.add(NOK)
        currencyMockList.add(JPY)
        currencyMockList.add(DKK)
        currencyMockList.add(CAD)
        currencyMockList.add(BYN)
        currencyMockList.add(CZK)
        currencyMockList.add(ILS)
        return currencyMockList
    }

    fun DataFirst():MutableList<CurrencyEntity>{
        var USD = CurrencyEntity(
            1, "Доллар США", "USD", 25.500, 28.800, 25.730 )
        var EUR = CurrencyEntity(
            2, "Євро", "EUR", 28.440, 28.900, 28.600 )
        var RUR = CurrencyEntity(
            3, "Російський Рубль", "RUR", 0.370, 0.410, 0.3900 )

        val currencyMockList = mutableListOf<CurrencyEntity>()
        currencyMockList.add(USD)
        currencyMockList.add(EUR)
        currencyMockList.add(RUR)
        return currencyMockList
    }
}