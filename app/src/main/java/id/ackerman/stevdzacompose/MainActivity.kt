package id.ackerman.stevdzacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.ackerman.stevdzacompose.component.ExpandableCard
import id.ackerman.stevdzacompose.component.LearnRow
import id.ackerman.stevdzacompose.component.SuperScriptText
import id.ackerman.stevdzacompose.ui.theme.StevdzaComposeTheme
import id.ackerman.stevdzacompose.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StevdzaComposeTheme {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.primary)
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {

                    ExpandableCard(
                        title = "Modern Android Development",
                        desc = "Lorem ipsu asdkjh asd asidh asidh asnd asidh asd lkasdj easdiha llasdlasdl fjasdladlasd nd aslda lasdlalsdl askd lemnlaksdhjiolashdioasdhioashdoasihdoaidhaioh laksnd lknweq lawskj a sdlkhjasd lkn lkansdlk alskdnalksdnalksdh lkahsd lakshj dalkhsd laksdh woqiey qwioey adl nasld khlaksdhjalsidku oiasduoasd oasidhaoi sdhoaishdoiqwheoqiwheoqiweh oiqwehoiqwehoiqwehioqwehoqwiheqwioeh ioqweh"
                    )

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StevdzaComposeTheme() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.primary)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            ExpandableCard(
                title = "Modern Android Development",
                desc = "Lorem ipsu asdkjh asd asidh asidh asnd asidh asd lkasdj easdiha llasdlasdl fjasdladlasd nd aslda lasdlalsdl askd lemnlaksdhjiolashdioasdhioashdoasihdoaidhaioh laksnd lknweq lawskj a sdlkhjasd lkn lkansdlk alskdnalksdnalksdh lkahsd lakshj dalkhsd laksdh woqiey qwioey adl nasld khlaksdhjalsidku oiasduoasd oasidhaoi sdhoaishdoiqwheoqiwheoqiweh oiqwehoiqwehoiqwehioqwehoqwiheqwioeh ioqweh"
            )

        }
    }
}

