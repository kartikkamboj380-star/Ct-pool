.class public final LA0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA0/b$a;
    }
.end annotation


# static fields
.field public static final c:LA0/b$a;

.field private static final d:Ljava/lang/String;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lv5/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA0/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LA0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LA0/b;->c:LA0/b$a;

    .line 8
    .line 9
    const-string v0, "function parseForm(form){\n\n    var values = \'\';\n    for(var i=0 ; i< form.elements.length; i++){\n        values +=\n            form.elements[i].name +\n            \'=\' +\n            form.elements[i].value +\n            \'|\'\n    }\n    FormInterceptorInterface.processFormData(values);\n}\n\n\nfor(var i=0 ; i< document.forms.length ; i++){\n    parseForm(document.forms[i]);\n}"

    .line 10
    .line 11
    sput-object v0, LA0/b;->d:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lv5/l;)V
    .locals 1

    .line 1
    const-string v0, "expectedState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LA0/b;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, LA0/b;->b:Lv5/l;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LA0/b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final processFormData(Ljava/lang/String;)V
    .locals 9
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "formData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "|"

    .line 7
    .line 8
    filled-new-array {v0}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    move-object v1, p1

    .line 17
    invoke-static/range {v1 .. v6}, LF5/g;->q0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v5, v1

    .line 41
    check-cast v5, Ljava/lang/String;

    .line 42
    .line 43
    const-string v6, "id_token"

    .line 44
    .line 45
    invoke-static {v5, v6, v2, v3, v4}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v1, v4

    .line 53
    :goto_0
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    move-object v6, v5

    .line 70
    check-cast v6, Ljava/lang/String;

    .line 71
    .line 72
    const-string v7, "code"

    .line 73
    .line 74
    invoke-static {v6, v7, v2, v3, v4}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move-object v5, v4

    .line 82
    :goto_1
    check-cast v5, Ljava/lang/String;

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_5

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    move-object v7, v6

    .line 99
    check-cast v7, Ljava/lang/String;

    .line 100
    .line 101
    const-string v8, "state"

    .line 102
    .line 103
    invoke-static {v7, v8, v2, v3, v4}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_4

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    move-object v6, v4

    .line 111
    :goto_2
    check-cast v6, Ljava/lang/String;

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    move-object v7, v0

    .line 128
    check-cast v7, Ljava/lang/String;

    .line 129
    .line 130
    const-string v8, "user"

    .line 131
    .line 132
    invoke-static {v7, v8, v2, v3, v4}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_6

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    move-object v0, v4

    .line 140
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 141
    .line 142
    if-eqz v6, :cond_10

    .line 143
    .line 144
    if-nez v5, :cond_8

    .line 145
    .line 146
    if-nez v1, :cond_8

    .line 147
    .line 148
    if-eqz v0, :cond_10

    .line 149
    .line 150
    :cond_8
    const-string p1, "="

    .line 151
    .line 152
    invoke-static {v6, p1, v4, v3, v4}, LF5/g;->z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-eqz v5, :cond_9

    .line 157
    .line 158
    invoke-static {v5, p1, v4, v3, v4}, LF5/g;->z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    goto :goto_4

    .line 163
    :cond_9
    move-object v5, v4

    .line 164
    :goto_4
    if-eqz v1, :cond_a

    .line 165
    .line 166
    invoke-static {v1, p1, v4, v3, v4}, LF5/g;->z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    goto :goto_5

    .line 171
    :cond_a
    move-object v1, v4

    .line 172
    :goto_5
    if-eqz v0, :cond_b

    .line 173
    .line 174
    invoke-static {v0, p1, v4, v3, v4}, LF5/g;->z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    :cond_b
    iget-object p1, p0, LA0/b;->a:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {v2, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_f

    .line 185
    .line 186
    iget-object p1, p0, LA0/b;->b:Lv5/l;

    .line 187
    .line 188
    new-instance v0, LA0/f$c;

    .line 189
    .line 190
    const-string v3, ""

    .line 191
    .line 192
    if-nez v5, :cond_c

    .line 193
    .line 194
    move-object v5, v3

    .line 195
    :cond_c
    if-nez v1, :cond_d

    .line 196
    .line 197
    move-object v1, v3

    .line 198
    :cond_d
    if-nez v4, :cond_e

    .line 199
    .line 200
    move-object v4, v3

    .line 201
    :cond_e
    invoke-direct {v0, v5, v1, v2, v4}, LA0/f$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :goto_6
    invoke-interface {p1, v0}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_f
    iget-object p1, p0, LA0/b;->b:Lv5/l;

    .line 209
    .line 210
    new-instance v0, LA0/f$b;

    .line 211
    .line 212
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 213
    .line 214
    const-string v2, "state does not match"

    .line 215
    .line 216
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {v0, v1}, LA0/f$b;-><init>(Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_10
    iget-object p1, p0, LA0/b;->b:Lv5/l;

    .line 224
    .line 225
    sget-object v0, LA0/f$a;->a:LA0/f$a;

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :goto_7
    return-void
.end method
