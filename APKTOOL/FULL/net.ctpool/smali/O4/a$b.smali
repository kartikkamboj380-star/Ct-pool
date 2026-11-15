.class final LO4/a$b;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO4/a;->c(Lm5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field p:Ljava/lang/Object;

.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:Ljava/lang/Object;

.field u:Ljava/lang/Object;

.field synthetic v:Ljava/lang/Object;

.field final synthetic w:LO4/a;

.field x:I


# direct methods
.method constructor <init>(LO4/a;Lm5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO4/a$b;->w:LO4/a;

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
    iput-object p1, p0, LO4/a$b;->v:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LO4/a$b;->x:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LO4/a$b;->x:I

    .line 9
    .line 10
    iget-object p1, p0, LO4/a$b;->w:LO4/a;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, LO4/a;->c(Lm5/d;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
