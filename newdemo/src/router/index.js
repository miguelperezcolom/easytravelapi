import Vue from 'vue'
import Router from 'vue-router'
import Reserva from '@/components/Reserva'
import Hotel from '@/components/hotel/Hotel'
import HotelDispo from '@/components/hotel/Dispo'
import HotelDetalle from '@/components/hotel/Detalle'
import Traslado from '@/components/traslado/Traslado'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'reserva',
      component: Reserva
    },
    {
      path: '/hotel',
      name: 'hotel',
      component: Hotel
    },
    {
      path: '/hotel/dispo',
      name: 'hotel_dispo',
      component: HotelDispo
    },
    {
      path: '/hotel/detalle',
      name: 'hotel_detalle',
      component: HotelDetalle
    },
    {
      path: '/traslado',
      name: 'traslado',
      component: Traslado
    },
  ]
})
