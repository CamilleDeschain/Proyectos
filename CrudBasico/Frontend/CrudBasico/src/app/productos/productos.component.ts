import { Component, OnInit } from '@angular/core';
import { ProductosService } from '../productos.service';

@Component({
  selector: 'app-productos',
  templateUrl: './productos.component.html',
  styleUrls: ['./productos.component.css']
})
export class ProductosComponent implements OnInit {

  productos: Array<any>;
  totalPages: Array<number>;

  page = 0;
  size = 10;
  order = 'id';
  asc = true;

  isFirst = false;
  isLast = false;

  constructor(private productosService: ProductosService) { }

  ngOnInit() {
    this.cargarProductos();
  }

  cargarProductos() {
    this.productosService.productos(this.page, this.size, this.order, this.asc).subscribe(
      data => {
        this.productos = data.content;
        this.isFirst = data.first;
        this.isLast = data.last;
        this.totalPages = new Array(data['totalPages']);
        console.log(data);
      },
      err => {
        console.log(err.error);
      }
    );
  }

  sort(): void {
    this.asc = !this.asc;
    this.cargarProductos();
  }

  rewind(): void {
    if (!this.isFirst) {
      this.page--;
      this.cargarProductos();
    }
  }

  forward(): void {
    if (!this.isLast) {
      this.page++;
      this.cargarProductos();
    }
  }

  setPage(page: number): void {
    this.page = page;
    this.cargarProductos();
  }

  setOrder(order: string): void {
    this.order = order;
    this.cargarProductos();
  }

}
