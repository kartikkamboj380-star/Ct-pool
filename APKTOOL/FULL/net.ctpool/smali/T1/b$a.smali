.class LT1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/util/SparseArray;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, LT1/b$a;->a:Landroid/util/SparseArray;

    return-void
.end method

.method synthetic constructor <init>(LT1/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LT1/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    iget-object v0, p0, LT1/b$a;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/graphics/Typeface;

    .line 8
    .line 9
    return-object p1
.end method

.method public b(ILandroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, LT1/b$a;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
