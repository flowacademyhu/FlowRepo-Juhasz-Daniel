import { Component, OnInit } from '@angular/core';
import { PokemonService } from '../pokemon.service';
import { Router } from '@angular/router';
import { IPokemon } from '../pokemoninterface';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.css']
})
export class PokemonComponent implements OnInit {

  constructor(private pokemonService: PokemonService, private router: Router) { }

  pokemons: IPokemon;

  pokemonName: string = '';

  url: string = '';

  goBack() {
    this.router.navigate(['']);
  }

  addNew() {
    let array = {
      name: this.pokemonName,
      url: this.url
    };
    this.pokemons.results.push(array);
  }

  ngOnInit() {

    this.pokemonService.get().subscribe(
      (result: any) => {
        this.pokemons = result;
        console.log(this.pokemons);
      }
    );

  }

}
