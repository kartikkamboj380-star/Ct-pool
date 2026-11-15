.class public LF2/i;
.super Lcom/facebook/react/uimanager/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/f;-><init>(Lcom/facebook/react/uimanager/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, -0x1

    .line 6
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    sparse-switch v2, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :sswitch_0
    const-string v2, "animationType"

    .line 16
    .line 17
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    const/16 v1, 0x8

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_1
    const-string v2, "hardwareAccelerated"

    .line 30
    .line 31
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x7

    .line 39
    goto :goto_0

    .line 40
    :sswitch_2
    const-string v2, "visible"

    .line 41
    .line 42
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v1, 0x6

    .line 50
    goto :goto_0

    .line 51
    :sswitch_3
    const-string v2, "animated"

    .line 52
    .line 53
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 v1, 0x5

    .line 61
    goto :goto_0

    .line 62
    :sswitch_4
    const-string v2, "statusBarTranslucent"

    .line 63
    .line 64
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_4

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    const/4 v1, 0x4

    .line 72
    goto :goto_0

    .line 73
    :sswitch_5
    const-string v2, "identifier"

    .line 74
    .line 75
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_5

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    const/4 v1, 0x3

    .line 83
    goto :goto_0

    .line 84
    :sswitch_6
    const-string v2, "transparent"

    .line 85
    .line 86
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_6

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_6
    const/4 v1, 0x2

    .line 94
    goto :goto_0

    .line 95
    :sswitch_7
    const-string v2, "supportedOrientations"

    .line 96
    .line 97
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_7

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_7
    const/4 v1, 0x1

    .line 105
    goto :goto_0

    .line 106
    :sswitch_8
    const-string v2, "presentationStyle"

    .line 107
    .line 108
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_8

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_8
    move v1, v0

    .line 116
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 117
    .line 118
    .line 119
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/f;->b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_7

    .line 123
    .line 124
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 125
    .line 126
    check-cast p2, LF2/j;

    .line 127
    .line 128
    check-cast p3, Ljava/lang/String;

    .line 129
    .line 130
    invoke-interface {p2, p1, p3}, LF2/j;->setAnimationType(Landroid/view/View;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_7

    .line 134
    .line 135
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 136
    .line 137
    check-cast p2, LF2/j;

    .line 138
    .line 139
    if-nez p3, :cond_9

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_9
    check-cast p3, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    :goto_1
    invoke-interface {p2, p1, v0}, LF2/j;->setHardwareAccelerated(Landroid/view/View;Z)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_7

    .line 152
    .line 153
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 154
    .line 155
    check-cast p2, LF2/j;

    .line 156
    .line 157
    if-nez p3, :cond_a

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_a
    check-cast p3, Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    :goto_2
    invoke-interface {p2, p1, v0}, LF2/j;->setVisible(Landroid/view/View;Z)V

    .line 167
    .line 168
    .line 169
    goto :goto_7

    .line 170
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 171
    .line 172
    check-cast p2, LF2/j;

    .line 173
    .line 174
    if-nez p3, :cond_b

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_b
    check-cast p3, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    :goto_3
    invoke-interface {p2, p1, v0}, LF2/j;->setAnimated(Landroid/view/View;Z)V

    .line 184
    .line 185
    .line 186
    goto :goto_7

    .line 187
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 188
    .line 189
    check-cast p2, LF2/j;

    .line 190
    .line 191
    if-nez p3, :cond_c

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_c
    check-cast p3, Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    :goto_4
    invoke-interface {p2, p1, v0}, LF2/j;->setStatusBarTranslucent(Landroid/view/View;Z)V

    .line 201
    .line 202
    .line 203
    goto :goto_7

    .line 204
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 205
    .line 206
    check-cast p2, LF2/j;

    .line 207
    .line 208
    if-nez p3, :cond_d

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_d
    check-cast p3, Ljava/lang/Double;

    .line 212
    .line 213
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    :goto_5
    invoke-interface {p2, p1, v0}, LF2/j;->setIdentifier(Landroid/view/View;I)V

    .line 218
    .line 219
    .line 220
    goto :goto_7

    .line 221
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 222
    .line 223
    check-cast p2, LF2/j;

    .line 224
    .line 225
    if-nez p3, :cond_e

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_e
    check-cast p3, Ljava/lang/Boolean;

    .line 229
    .line 230
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    :goto_6
    invoke-interface {p2, p1, v0}, LF2/j;->setTransparent(Landroid/view/View;Z)V

    .line 235
    .line 236
    .line 237
    goto :goto_7

    .line 238
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 239
    .line 240
    check-cast p2, LF2/j;

    .line 241
    .line 242
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 243
    .line 244
    invoke-interface {p2, p1, p3}, LF2/j;->setSupportedOrientations(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 245
    .line 246
    .line 247
    goto :goto_7

    .line 248
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 249
    .line 250
    check-cast p2, LF2/j;

    .line 251
    .line 252
    check-cast p3, Ljava/lang/String;

    .line 253
    .line 254
    invoke-interface {p2, p1, p3}, LF2/j;->setPresentationStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    :goto_7
    return-void

    .line 258
    nop

    .line 259
    :sswitch_data_0
    .sparse-switch
        -0x6e5d7149 -> :sswitch_8
        -0x6e46a78f -> :sswitch_7
        -0x66e3a2ae -> :sswitch_6
        -0x60775357 -> :sswitch_5
        -0x44e94228 -> :sswitch_4
        -0x2f65d65d -> :sswitch_3
        0x1bd1f072 -> :sswitch_2
        0x4749621f -> :sswitch_1
        0x7911bcde -> :sswitch_0
    .end sparse-switch

    .line 260
    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
