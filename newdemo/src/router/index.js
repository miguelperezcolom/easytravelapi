import Vue from 'vue'
import Router from 'vue-router'
import Reserva from '@/components/Reserva'
import Hotel from '@/components/hotel/Hotel'
import HotelFormulario from '@/components/hotel/Formulario'
import HotelDispo from '@/components/hotel/Dispo'
import HotelRates from '@/components/hotel/Rates'
import HotelDetalle from '@/components/hotel/Detalle'
import Traslado from '@/components/traslado/Traslado'
import Excursion from '@/components/excursion/Excursion'
import ExcursionFormulario from '@/components/excursion/Formulario'
import ExcursionDispo from '@/components/excursion/Dispo'
import ExcursionRates from '@/components/excursion/Rates'
import ExcursionDetalle from '@/components/excursion/Detalle'
import Ok from '@/components/Ok'
import Ko from '@/components/Ko'
import Config from '@/components/Config'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'reserva',
      component: Reserva,
      children: [

        {

          path: 'hotel',
          name: 'hotel',
          component: Hotel,
          children: [

            {
              path: '',
              name: 'hotel_formulario',
              component: HotelFormulario
            },

            {
              path: 'dispo',
              name: 'hotel_dispo',
              component: HotelDispo
            },
            {
              path: 'rates',
              name: 'hotel_rates',
              component: HotelRates
            },
            {
              path: 'detalle',
              name: 'hotel_detalle',
              component: HotelDetalle
            },

          ],

        },

        {
          path: 'traslado',
          name: 'traslado',
          component: Traslado
        },

        {
          path: 'excursion',
          name: 'excursion',
          component: Excursion,
          children: [

            {
              path: '',
              name: 'excursion_formulario',
              component: ExcursionFormulario
            },
            {
              path: 'dispo',
              name: 'excursion_dispo',
              component: ExcursionDispo
            },
            {
              path: 'rates',
              name: 'excursion_rates',
              component: ExcursionRates
            },
            {
              path: 'detalle',
              name: 'excursion_detalle',
              component: ExcursionDetalle
            },

          ],

        },

        {
          path: 'ok',
          name: 'ok',
          component: Ok
        },
        {
          path: 'ko',
          name: 'ko',
          component: Ko
        },
        {
          path: 'config',
          name: 'config',
          component: Config
        },
      ],
    },

  ]
})
