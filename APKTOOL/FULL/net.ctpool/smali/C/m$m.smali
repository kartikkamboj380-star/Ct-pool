.class final LC/m$m;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/m;->v(Lm5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field p:Ljava/lang/Object;

.field synthetic q:Ljava/lang/Object;

.field final synthetic r:LC/m;

.field s:I


# direct methods
.method constructor <init>(LC/m;Lm5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/m$m;->r:LC/m;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lo5/d;-><init>(Lm5/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LC/m$m;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LC/m$m;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LC/m$m;->s:I

    .line 9
    .line 10
    iget-object p1, p0, LC/m$m;->r:LC/m;

    .line 11
    .line 12
    invoke-static {p1, p0}, LC/m;->l(LC/m;Lm5/d;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
