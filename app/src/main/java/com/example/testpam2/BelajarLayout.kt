package com.example.testpam2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)

@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ){
        HeaderSection()
        DetailMhs(
            parameterName = "Nama",
            argu = "Nauval Achid Rosady"
        )
        DetailMhs(
            parameterName = "NIM",
            argu = "20220140117"
        )
        DetailMhs(
            parameterName = "Prodi",
            argu = "Tekonologi Informasi"
        )
        DetailMhs(
            parameterName = "Fakultas",
            argu = "Teknik"
        )
        DetailMhs(
            parameterName = "Universitas",
            argu = "Universitas Muhammadiyah Yogyakarta"
        )
        DetailMhs(
            parameterName = "Alamat",
            argu = "Jl K H Agus Salim No 02"
        )
        DetailMhs(
            parameterName = "Email",
            argu = "nauvalachid@gmail.com"
        )

    }
}

@Composable
fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Box(
                contentAlignment = Alignment.BottomEnd
            ) {

                Image(
                    painter = painterResource(id = R.drawable.kmti), contentDescription = "",
                    modifier = Modifier.clip(CircleShape)
                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = "",
                    modifier = Modifier.size(30.dp).background(Color.Red)
                )
            }
            Column(
                modifier = Modifier.padding(14.dp)
            ) {
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }
    }
}

@Composable
fun DetailMhs(
    parameterName: String, argu : String
)
    {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = parameterName,
                modifier = Modifier.weight(0.8f)
            )
            Text(
                text = ":",
                modifier = Modifier.weight(0.2f)
            )
            Text(
                text = argu,
                modifier = Modifier.weight(2f)
            )
        }
    }
}



