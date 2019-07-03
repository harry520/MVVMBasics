package com.example.mvvmbasics.utilities

import com.example.mvvmbasics.data.FakeDatabase
import com.example.mvvmbasics.data.QuoteRepository
import com.example.mvvmbasics.ui.quotes.QuotesViewModelFactory

object InjectUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
       val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }

}