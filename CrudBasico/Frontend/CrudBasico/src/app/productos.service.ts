import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductosService {

  productossURL = 'http://localhost:8080/productos?';
  constructor(private httpClient: HttpClient) { }

  public productos(page: number, size: number, order: string, asc: boolean): Observable<any> {
    return this.httpClient.get<any>(this.productossURL + `page=${page}&size=${size}&order=${order}&asc=${asc}`);
  }
}
