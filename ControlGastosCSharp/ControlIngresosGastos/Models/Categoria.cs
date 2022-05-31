using System.ComponentModel.DataAnnotations;

namespace ControlIngresosGastos.Models
{
    public class Categoria
    {
        [Key]
        public int Id { get; set; }

        [Required]
        [MaxLength(120)]
        [Display(Name ="Nombre Categoria")]
        public string NameCategoria { get; set; }

        [Required]
        [MaxLength(2)]
        [Display(Name ="Tipo")]
        public string tipo { get; set; }

        [Required]
        public bool Estado { get; set; }
    }
}
