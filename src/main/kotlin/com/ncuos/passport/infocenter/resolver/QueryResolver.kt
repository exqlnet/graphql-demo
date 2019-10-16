package com.ncuos.passport.infocenter.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component


@Component
class QueryResolver : GraphQLQueryResolver {

    fun name() : String {
        return "licong"
    }
}
