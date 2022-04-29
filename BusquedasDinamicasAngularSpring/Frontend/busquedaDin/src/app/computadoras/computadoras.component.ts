import { Component, OnInit } from '@angular/core';
import { ComputadorasService } from './computadoras.service';
import { Busqueda } from '../model/busqueda';

@Component({
  selector: 'app-computadoras',
  templateUrl: './computadoras.component.html',
  styleUrls: ['./computadoras.component.css']
})
export class ComputadorasComponent implements OnInit {

  computadoras: any[] = [];
  marcas: any[] = [];
  marcaElegida: any = null;

  busqueda: Busqueda = {
    marca: '',
    modelo: '',
    version: '',
    cambio: '',
    color: '',
    tamanoDesde: null,
    tamanoHasta: null
  };

  constructor(private computadoraService: ComputadorasService) { }

  ngOnInit() {
    this.listaMarcas();
    this.listaComputadoras();
  }

  listaMarcas(): void {
    this.computadoraService.marcas().subscribe(
      data => {
        this.marcas = data;
      },
      err => {
        console.log(err);
      }
    );
  }

  listaComputadoras(): void {
    this.computadoraService.computadoras(this.busqueda).subscribe(
      data => {
        this.computadoras = data;
      },
      err => {
        console.log(err);
      }
    );
  }

  onChangeMarca(): void {
    if (this.marcaElegida) {
      this.busqueda.marca = this.marcaElegida.nombre;
    } else {
      this.busqueda.marca = '';
      this.busqueda.modelo = '';
    }
    this.listaComputadoras();
  }

  clearVersion(): void {
    this.busqueda.version = '';
    this.listaComputadoras();
  }

  cleartamanoDesde(): void {
    this.busqueda.tamanoDesde = null;
    this.listaComputadoras();
  }

  cleartamanoHasta(): void {
    this.busqueda.tamanoHasta = null;
    this.listaComputadoras();
  }

  clear(): void {
    this.marcaElegida = null;
    this.busqueda.marca = '';
    this.busqueda.modelo = '';
    this.busqueda.version = '';
    this.busqueda.cambio = '';
    this.busqueda.color = '';
    this.busqueda.tamanoDesde = null;
    this.busqueda.tamanoHasta = null;
    this.listaComputadoras();
  }
}
