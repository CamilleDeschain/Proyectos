import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Busqueda } from '../model/busqueda';

@Injectable({
  providedIn: 'root'
})
export class ComputadorasService {

  computadorasURL = 'http://localhost:8080/';

  constructor(private httpClient: HttpClient) { }

  marcas(): Observable<any[]> {
    return this.httpClient.get<any[]>(this.computadorasURL + 'marca/list');
  }

  computadoras(busqueda: Busqueda): Observable<any[]> {
    return this.httpClient.post<any[]>(this.computadorasURL + 'computadora/list', busqueda);
  }
}
