package com.example.a30days

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30days.model.Day
import com.example.a30days.model.DayRepo
import com.example.a30days.ui.theme.DaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DaysTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DaysApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun DaysApp(
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(DayRepo.days) { day ->
            TipCard(day)
        }
    }
}

@Composable
fun TipCard(day: Day, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { expanded = !expanded },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier.padding(16.dp)) {
            DayInfo(
                stringResource(day.descRes),
                MaterialTheme.typography.titleMedium
            )
            DayInfo(
                stringResource(day.dayRes),
                MaterialTheme.typography.labelLarge
            )
            DayImage(
                visible = true,
                dayImage = day.imageRes
            )
            Spacer(modifier = Modifier.height(8.dp))
            if (expanded)
                DayInfo(
                    stringResource(day.titleRes),
                    MaterialTheme.typography.bodyLarge
                )
        }
    }
}

@Composable
fun DayImage(visible: Boolean, @DrawableRes dayImage: Int, modifier: Modifier = Modifier) {
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn() + expandHorizontally(),
        exit = fadeOut() + shrinkHorizontally()
    ) {
        Image(
            painter = painterResource(dayImage),
            contentDescription = null,
            modifier = modifier.size(height = 300.dp, width = 500.dp),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun DayInfo(name: String, style: TextStyle) {
    Text(
        text = name,
        style = style,
    )

}
@Preview("Light Theme")
@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GreetingPreview() {
    DaysTheme {
        DaysApp()
    }
}