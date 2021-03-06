package com.sion.itunes.model.api.search

import com.sion.itunes.model.vo.SearchResponse
import retrofit2.Response

interface ISearchApiRepository {
    suspend fun search(term: String, offset: Int = 0, limit: Int = SearchApiRepository.NETWORK_PAGE_SIZE): Response<SearchResponse>
}