package id.ackerman.stevdzacompose.component

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import id.ackerman.stevdzacompose.ui.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExpandableCard(
    title: String,
    fontSize: TextUnit = MaterialTheme.typography.h6.fontSize,
    fontWeight: FontWeight = FontWeight.Bold,
    desc: String,
    descFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    descFontWeight: FontWeight = FontWeight.Normal,
    descMaxLines: Int = 4,
    shape: CornerBasedShape = Shapes.medium,
    padding: Dp = 12.dp
) {

    var expandableState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(targetValue = if (expandableState) 180f else 0f)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = shape,
        onClick = {
            expandableState = !expandableState
        }
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding),
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {

               Text(
                   modifier = Modifier.weight(5f),
                   text = title,
                   fontSize = fontSize,
                   fontWeight = fontWeight,
                   maxLines = 1,
                   overflow = TextOverflow.Ellipsis // macem Ellipse End
               )
                
                IconButton(
                    modifier = Modifier
                        .alpha(ContentAlpha.medium)
                        .weight(1f)
                        .rotate(rotationState)
                    ,
                    onClick = {
                        expandableState = !expandableState
                    }) {

                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Drop-Down Arrow"
                    )
                }
            }

            if (expandableState) {

                Text(
                    text = desc,
                    fontSize = descFontSize,
                    fontWeight = descFontWeight,
                    maxLines = descMaxLines,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
@Preview
fun ExpandableCardPreview() {
    ExpandableCard(
        title = "Modern Android Development",
        desc = "Lorem ipsu asdkjh asd asidh asidh asnd asidh asd lkasdj easdiha llasdlasdl fjasdladlasd nd aslda lasdlalsdl askd lemnlaksdhjiolashdioasdhioashdoasihdoaidhaioh laksnd lknweq lawskj a sdlkhjasd lkn lkansdlk alskdnalksdnalksdh lkahsd lakshj dalkhsd laksdh woqiey qwioey adl nasld khlaksdhjalsidku oiasduoasd oasidhaoi sdhoaishdoiqwheoqiwheoqiweh oiqwehoiqwehoiqwehioqwehoqwiheqwioeh ioqweh"
    )
}














