
package one.task.favtravelbadge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainActivityScreen()
        }
    }
}

@Composable
fun MainActivityScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEAF2FA))
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    )
    {

        Text(
            text = "Fav Travel Badge",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
          )

        Image(
            painter = painterResource(R.drawable.lisbon),
            contentDescription = "Lisbon",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .clip(RoundedCornerShape(15.dp)),
            contentScale = ContentScale.Crop
            )

        Text(
            text = "Lisbon, Portugal 🇵🇹",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

         Text(
            text = "Capital of Portugal",
            fontSize = 16.sp
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("☀")
                Text("Weather")
                Text("20°C")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("🌐")
                Text("Language")
                Text("Portuguese")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("€")
                Text("Currency")
                Text("Euro")
            }
        }

        HorizontalDivider()



        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Famous Attractions",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text("🏰 Belém Tower", fontSize = 16.sp)
             Text("🚋 Tram 28", fontSize = 16.sp)
            Text("🏛️ Jerónimos Monastery", fontSize = 16.sp)

            Spacer(modifier = Modifier.height(15.dp))

            HorizontalDivider()

             Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "About Lisbon",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))


              Text(
                text = "Lisbon is the capitl of Portugal, famous for its " +
                        "colorful streets, historic buildings, and yellow trams. " +
                        "The city offers beautiful views of the Tagus River, " +
                        "delicious food, and a rich culture. It is a great " +
                        "place to explore and enjoy",
                fontSize = 15.sp,
                lineHeight = 22.sp
            )

        }


         Text(
            text = "❤️ My Fav Destination",
            fontSize = 17.sp,
            color = Color(0xFF24658B)
        )
      }
}

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    MainActivityScreen()
}
