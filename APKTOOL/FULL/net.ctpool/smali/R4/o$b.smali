.class final enum LR4/o$b;
.super LR4/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR4/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, LR4/o;-><init>(Ljava/lang/String;ILR4/o$a;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public e(LY4/a;)Ljava/lang/Number;
    .locals 1

    .line 1
    new-instance v0, LT4/g;

    .line 2
    .line 3
    invoke-virtual {p1}, LY4/a;->H0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, LT4/g;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
