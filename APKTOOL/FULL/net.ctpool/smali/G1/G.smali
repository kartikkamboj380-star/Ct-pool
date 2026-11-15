.class public LG1/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Landroid/util/SparseIntArray;

.field public final d:I

.field public final e:I

.field public f:Z

.field public final g:I


# direct methods
.method public constructor <init>(IILandroid/util/SparseIntArray;)V
    .locals 7

    const v5, 0x7fffffff

    const/4 v6, -0x1

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    .line 1
    invoke-direct/range {v0 .. v6}, LG1/G;-><init>(IILandroid/util/SparseIntArray;III)V

    return-void
.end method

.method public constructor <init>(IILandroid/util/SparseIntArray;III)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LO0/l;->i(Z)V

    iput p1, p0, LG1/G;->b:I

    iput p2, p0, LG1/G;->a:I

    iput-object p3, p0, LG1/G;->c:Landroid/util/SparseIntArray;

    iput p4, p0, LG1/G;->d:I

    iput p5, p0, LG1/G;->e:I

    iput p6, p0, LG1/G;->g:I

    return-void
.end method
