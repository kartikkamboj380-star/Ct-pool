.class public final Lcom/reactnativecommunity/webview/j$b;
.super Lcom/reactnativecommunity/webview/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/webview/j;->g0(Lcom/reactnativecommunity/webview/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/webview/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/c;-><init>(Lcom/reactnativecommunity/webview/d;)V

    return-void
.end method


# virtual methods
.method public getDefaultVideoPoster()Landroid/graphics/Bitmap;
    .locals 2

    const/16 v0, 0x32

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
