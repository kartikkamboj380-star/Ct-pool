.class public Lcom/facebook/react/views/text/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/text/Spannable;

.field private final b:I

.field private final c:Z

.field private final d:F

.field private final e:F

.field private final f:F

.field private final g:F

.field private final h:I

.field private final i:I

.field private final j:I


# direct methods
.method public constructor <init>(Landroid/text/Spannable;IZFFFFIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/text/i;->a:Landroid/text/Spannable;

    iput p2, p0, Lcom/facebook/react/views/text/i;->b:I

    iput-boolean p3, p0, Lcom/facebook/react/views/text/i;->c:Z

    iput p4, p0, Lcom/facebook/react/views/text/i;->d:F

    iput p5, p0, Lcom/facebook/react/views/text/i;->e:F

    iput p6, p0, Lcom/facebook/react/views/text/i;->f:F

    iput p7, p0, Lcom/facebook/react/views/text/i;->g:F

    iput p8, p0, Lcom/facebook/react/views/text/i;->h:I

    iput p9, p0, Lcom/facebook/react/views/text/i;->i:I

    iput p10, p0, Lcom/facebook/react/views/text/i;->j:I

    return-void
.end method

.method public constructor <init>(Landroid/text/Spannable;IZIII)V
    .locals 11

    .line 2
    const/high16 v6, -0x40800000    # -1.0f

    const/high16 v7, -0x40800000    # -1.0f

    const/high16 v4, -0x40800000    # -1.0f

    const/high16 v5, -0x40800000    # -1.0f

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/text/i;-><init>(Landroid/text/Spannable;IZFFFFIII)V

    return-void
.end method

.method public static a(Landroid/text/Spannable;IIII)Lcom/facebook/react/views/text/i;
    .locals 8

    .line 1
    new-instance v7, Lcom/facebook/react/views/text/i;

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/facebook/react/views/text/i;-><init>(Landroid/text/Spannable;IZIII)V

    return-object v7
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/i;->c:Z

    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/i;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/i;->j:I

    return v0
.end method

.method public e()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/i;->g:F

    return v0
.end method

.method public f()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/i;->d:F

    return v0
.end method

.method public g()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/i;->f:F

    return v0
.end method

.method public h()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/i;->e:F

    return v0
.end method

.method public i()Landroid/text/Spannable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/i;->a:Landroid/text/Spannable;

    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/i;->h:I

    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/i;->i:I

    return v0
.end method
