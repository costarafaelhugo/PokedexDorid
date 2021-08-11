package com.hugorafaelcosta.pokedexdroid.api

import androidx.recyclerview.widget.RecyclerView
import com.hugorafaelcosta.pokedexdroid.domain.Pokemon

class PokemonRepository(
    val items: List<Pokemon>
)  : RecyclerView.Adapter<>{
}