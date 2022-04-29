import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ComputadorasComponent } from './computadoras/computadoras.component';

const routes: Routes = [
  {path: '', component: ComputadorasComponent},
  {path: 'coches', component: ComputadorasComponent},
  {path: '**', redirectTo: 'coches', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
