package br.com.sosthenes.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.sosthenes.orgs.R
import br.com.sosthenes.orgs.dao.ProdutosDao
import br.com.sosthenes.orgs.model.Produto
import java.math.BigDecimal


import java.util.Locale

class MainActivity : AppCompatActivity(R.layout.activity_main) {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            supportActionBar?.hide()
            redirecionarBotao()
        }

        private fun redirecionarBotao() {
            val botaoRedirecionar = findViewById<Button>(R.id.next_level_button)

            botaoRedirecionar.setOnClickListener {
                val intent = Intent(this@MainActivity, FormularioProdutoActivity::class.java)
                startActivity(intent)
            }
        }

}